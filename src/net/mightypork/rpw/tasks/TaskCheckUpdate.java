package net.mightypork.rpw.tasks;


import java.net.URL;
import java.util.Scanner;

import net.mightypork.rpw.Const;
import net.mightypork.rpw.Paths;
import net.mightypork.rpw.gui.windows.messages.DialogUpdateNotify;
import net.mightypork.rpw.utils.GuiUtils;
import net.mightypork.rpw.utils.logging.Log;


public class TaskCheckUpdate {

	public static void run() {

		Log.f2("Downloading update info");

		(new Thread(new Runnable() {

			@Override
			public void run() {

				Scanner sc = null;
				try {

					URL u = new URL(Paths.URL_UPDATE_FILE);

					sc = new Scanner(u.openStream(), "UTF-8");

					String v, msg;
					int vs = 0;


					// version name
					if (!sc.hasNext()) return;
					v = sc.nextLine().trim();


					// version serial
					if (!sc.hasNext()) return;
					vs = Integer.valueOf(sc.nextLine().trim());


					// version message
					if (!sc.hasNext()) return;
					msg = "";
					while (sc.hasNext()) {
						msg += sc.nextLine() + "\n";
					}
					msg = msg.trim();


					Log.f2("Downloading update info - done.");

					if (vs <= Const.VERSION_SERIAL) {
						Log.i("Your version is up-to-date.");
						return;
					}

					GuiUtils.open(new DialogUpdateNotify(v, msg));

				} catch (Throwable t) {
					Log.e("Could not download update info file.");
				} finally {
					if (sc != null) sc.close();
				}
			}
		})).start();

	}
}
