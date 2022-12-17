package org.eclipse.sirius.lidlgui.ui.config;

public class GuiGlobalConfig {
	
	public static final String PERSPECTIVE_ID = "org.xxxx.gui.ui.perspective";
	public static final String PLATFORM_PREFIX = "platform:/resource/";
	public static final String PROJECT_NAME = "GUIFactory";
	public static final String MODEL_NAME = "UI.model";
	public static final String SESSION_NAME = "representations.aird";
	public static final String MODEL_PATH = PLATFORM_PREFIX + PROJECT_NAME + "/" + MODEL_NAME;
	public static final String SESSION_PATH = PLATFORM_PREFIX + PROJECT_NAME + "/" + SESSION_NAME;
	
	public static final String GUI_VIEWPOINT = "gui";
	
	public static final String GUI_IDENTIFIER = "用户界面设计工具";
	
	public static final String GUI_DIAGRAM_COLLECTION_IDENTIFIER = "用户界面图";
	public static final String GUI_DIAGRAM_IDENTIFIER = "用户界面";
	public static final String GUI_DIAGRAM_REPRESENTATION = "GUI";
	public static final String COMBOWIDGET_COLLECTION_IDENTIFIER = "组合组件库";
	public static final String COMBOWIDGET_IDENTIFIER = "组合组件";
	public static final String COMBOWIDGET_REPRESENTATION = "ComboWidget Diagram";
	public static final String INTERACTION_DIAGRAM_IDENTIFIER = "Interaction architecture diagram";
	public static final String INTERACTION_DIAGRAM_REPRESENTATION = "Interaction Diagram";
}
