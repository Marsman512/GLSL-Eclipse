package org.johnnei.glsl.editor;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.johnnei.glsl.preferences.PreferenceConstants;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "glslEditor"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private ColorManager colorManager;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}
	
	public Color getColor(RGB[] colors) {
		if (colorManager == null) {
			colorManager = new ColorManager(getTheme());
		}
		
		return colorManager.getColor(colors);
	}
	
	private int getTheme() {
		try {
			return Integer.parseInt(
				getPreferenceStore().getString(PreferenceConstants.P_THEME)
			);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		colorManager.dispose();
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
