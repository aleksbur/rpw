package net.mightypork.rpw.gui;


import java.awt.Dimension;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.coobird.thumbnailator.ThumbnailParameter;
import net.coobird.thumbnailator.Thumbnailator;
import net.coobird.thumbnailator.geometry.AbsoluteSize;
import net.coobird.thumbnailator.geometry.Positions;
import net.coobird.thumbnailator.geometry.Region;
import net.coobird.thumbnailator.resizers.AbstractResizer;
import net.coobird.thumbnailator.tasks.SourceSinkThumbnailTask;
import net.coobird.thumbnailator.tasks.ThumbnailTask;
import net.coobird.thumbnailator.tasks.io.BufferedImageSink;
import net.coobird.thumbnailator.tasks.io.BufferedImageSource;
import net.coobird.thumbnailator.tasks.io.ImageSink;
import net.coobird.thumbnailator.tasks.io.ImageSource;
import net.mightypork.rpw.Paths;
import net.mightypork.rpw.utils.FileUtils;
import net.mightypork.rpw.utils.Log;


public class Icons {

	public static ImageIcon MENU_NEW;
	public static ImageIcon MENU_SAVE;
	public static ImageIcon MENU_SAVE_AS;
	public static ImageIcon MENU_OPEN;
	public static ImageIcon MENU_MANAGE;
	public static ImageIcon MENU_SETUP;
	public static ImageIcon MENU_IMPORT_BOX;
	public static ImageIcon MENU_EXPORT_BOX;
	public static ImageIcon MENU_EXPORT;
	public static ImageIcon MENU_UNDO;
	public static ImageIcon MENU_REDO;
	public static ImageIcon MENU_RELOAD;
	public static ImageIcon MENU_RELOAD2;
	public static ImageIcon MENU_EDIT;
	public static ImageIcon MENU_CLEAR;
	public static ImageIcon MENU_EXIT;
	public static ImageIcon MENU_ABOUT;
	public static ImageIcon MENU_HELP;
	public static ImageIcon MENU_DELETE_ASSET;
	public static ImageIcon MENU_COPY;
	public static ImageIcon MENU_SET_TO_SOURCE;
	public static ImageIcon MENU_PROJECT;
	public static ImageIcon MENU_SILENCE;
	public static ImageIcon MENU_TREE;
	public static ImageIcon MENU_RECURSION;
	public static ImageIcon MENU_CANCEL;
	public static ImageIcon MENU_RENAME;
	public static ImageIcon MENU_DELETE;
	public static ImageIcon MENU_LOG;
	public static ImageIcon MENU_RECENT;
	public static ImageIcon MENU_VANILLA;
	public static ImageIcon MENU_INHERIT;
	public static ImageIcon MENU_RESOLVE;
	public static ImageIcon MENU_INFO;
	public static ImageIcon MENU_GENERATE;

	public static ImageIcon TREE_CLOSE;
	public static ImageIcon TREE_OPEN;
	public static ImageIcon TREE_FOLDER;
	public static ImageIcon TREE_FILE_AUDIO;
	public static ImageIcon TREE_FILE_IMAGE;
	public static ImageIcon TREE_FILE_TEXT;

	public static ImageIcon LOADING;
	public static ImageIcon MENU_YES;
	public static ImageIcon ABOUT;
	public static ImageIcon TRANSPARENT;
	public static ImageIcon TRANSPARENT_FONTS;
	public static ImageIcon MENU_TWITTER;
	public static ImageIcon WINDOW;
	public static ImageIcon AUDIO;


	public static void init() {

		Log.f2("Loading GUI icons");

		String imgPath = Paths.DATA_DIR_IMAGES;

		MENU_NEW = loadImage(imgPath + "menu/new.png");
		MENU_SAVE = loadImage(imgPath + "menu/save.png");
		MENU_SAVE_AS = loadImage(imgPath + "menu/save-as.png");
		MENU_OPEN = loadImage(imgPath + "menu/open.png");
		MENU_SETUP = loadImage(imgPath + "menu/config.png");
		MENU_MANAGE = loadImage(imgPath + "menu/manage.png");
		MENU_EXPORT = loadImage(imgPath + "menu/export.png");
		MENU_UNDO = loadImage(imgPath + "menu/undo.png");
		MENU_REDO = loadImage(imgPath + "menu/redo.png");
		MENU_RELOAD = loadImage(imgPath + "menu/reload.png");
		MENU_RELOAD2 = loadImage(imgPath + "menu/reload2.png");
		MENU_EDIT = loadImage(imgPath + "menu/edit.png");
		MENU_CLEAR = loadImage(imgPath + "menu/clear.png");
		MENU_HELP = loadImage(imgPath + "menu/help.png");
		MENU_ABOUT = loadImage(imgPath + "menu/information.png");
		MENU_DELETE_ASSET = loadImage(imgPath + "menu/delete.png");
		MENU_DELETE = loadImage(imgPath + "menu/delete-trash.png");
		MENU_COPY = loadImage(imgPath + "menu/copy.png");
		MENU_SET_TO_SOURCE = loadImage(imgPath + "menu/set-to-source.png");
		MENU_PROJECT = loadImage(imgPath + "menu/project.png");
		MENU_SILENCE = loadImage(imgPath + "menu/silence.png");
		MENU_TREE = loadImage(imgPath + "menu/tree.png");
		MENU_RECURSION = loadImage(imgPath + "menu/recursion.png");
		MENU_CANCEL = loadImage(imgPath + "menu/close.png");
		MENU_EXIT = loadImage(imgPath + "menu/exit.png");
		MENU_RENAME = loadImage(imgPath + "menu/rename.png");
		MENU_YES = loadImage(imgPath + "menu/yes.png");
		MENU_TWITTER = loadImage(imgPath + "menu/twitter.png");
		MENU_LOG = loadImage(imgPath + "menu/bug.png");
		MENU_RECENT = loadImage(imgPath + "menu/time.png");
		MENU_IMPORT_BOX = loadImage(imgPath + "menu/import-box.png");
		MENU_EXPORT_BOX = loadImage(imgPath + "menu/export-box.png");
		MENU_VANILLA = loadImage(imgPath + "menu/vanilla.png");
		MENU_INHERIT = loadImage(imgPath + "menu/inherit.png");
		MENU_RESOLVE = loadImage(imgPath + "menu/resolve.png");
		MENU_INFO = loadImage(imgPath + "menu/information.png");
		MENU_GENERATE = loadImage(imgPath + "menu/lightning.png");

		WINDOW = loadImage(imgPath + "window-icon.png");
		AUDIO = loadImage(imgPath + "sound-icon.png");
		TRANSPARENT = loadImage(imgPath + "transparent.png");
		TRANSPARENT_FONTS = loadImage(imgPath + "transparent-fonts.png");

		ABOUT = loadImage(imgPath + "about.png");


		TREE_CLOSE = loadImage(imgPath + "tree-16/close.png");
		TREE_OPEN = loadImage(imgPath + "tree-16/open.png");
		TREE_FOLDER = loadImage(imgPath + "tree-16/folder.png");
		TREE_FILE_AUDIO = loadImage(imgPath + "tree-16/file-audio.png");
		TREE_FILE_IMAGE = loadImage(imgPath + "tree-16/file-image.png");
		TREE_FILE_TEXT = loadImage(imgPath + "tree-16/file-text.png");

		LOADING = new ImageIcon(Icons.class.getResource(imgPath + "loading.gif"));

		Log.f2("Loading GUI icons - done.");
	}


	private static ImageIcon loadImage(String path) {

		BufferedImage bi = null;

		Image i = null;
		try {

			bi = ImageIO.read(FileUtils.getResource(path));
			// i = bi.getScaledInstance(32, 32, Image.SCALE_FAST);
			i = bi;
			return new ImageIcon(i);

		} catch (Exception e) {
			Log.e("Failed loading icon " + path, e);
			return null;
		}

	}


	private static class MyResizer extends AbstractResizer {

		public MyResizer() {

			this(Collections.<RenderingHints.Key, Object> emptyMap());
		}


		public MyResizer(Map<RenderingHints.Key, Object> hints) {

			super(RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR, hints);
		}
	}


	public static ImageIcon getIconFromStream(InputStream in, Dimension size) {

		Image i = null;
		BufferedImage orig = null;
		try {

			orig = ImageIO.read(in);
			if (size != null) {

				ImageSource<BufferedImage> src = new BufferedImageSource(orig);
				ImageSink<BufferedImage> out = new BufferedImageSink();

				Region r = null;

				if (orig.getHeight() > orig.getWidth() * 8) {
					r = new Region(Positions.TOP_LEFT, new AbsoluteSize(orig.getWidth(), orig.getWidth()));
				}

				ThumbnailParameter p = new ThumbnailParameter(size, r, true, ThumbnailParameter.ORIGINAL_FORMAT, ThumbnailParameter.DEFAULT_FORMAT_TYPE, 0, ThumbnailParameter.DEFAULT_IMAGE_TYPE,
						null, new MyResizer(), true, false);

				ThumbnailTask<BufferedImage, BufferedImage> task = new SourceSinkThumbnailTask<BufferedImage, BufferedImage>(p, src, out);

				Thumbnailator.createThumbnail(task);


				i = out.getSink(); //Thumbnailator.createThumbnail(orig, size.width, size.height);
			} else {
				i = orig;
			}
			return new ImageIcon(i);

		} catch (Exception e) {
			Log.e("Failed loading icon.", e);
			return null;
		}
	}


	public static ImageIcon getIconFromFile(File file, Dimension size) {

		try {
			return getIconFromStream(new FileInputStream(file), size);
		} catch (Exception e) {
			Log.e("Failed loading icon " + file, e);
			return null;
		}
	}
}