package org.eclipse.sirius.lidlgui.ui.config;

public class LidlTableGlobalConfig {
	
	public static final String PERSPECTIVE_ID = "org.xxxx.lidltable.ui.perspective";
	public static final String PLATFORM_PREFIX = "platform:/resource/";
	public static final String PROJECT_NAME = "LIDLTableFactory";
	public static final String MODEL_NAME = "LIDLTable.model";
	public static final String SESSION_NAME = "representations.aird";
	public static final String MODEL_PATH = PLATFORM_PREFIX + PROJECT_NAME + "/" + MODEL_NAME;
	public static final String SESSION_PATH = PLATFORM_PREFIX + PROJECT_NAME + "/" + SESSION_NAME;
	
	public static final String LIDL_TABLE_VIEWPOINT = "lidltableViewpoint";
	
	public static final String LIDL_TABLE_IDENTIFIER = "LIDL tables";
	
	// DATATYPE_TABLE_IDENTIFIER is used to set the title of data type tables in Table Explorer
	public static final String DATATYPE_TABLE_IDENTIFIER = "1-Data type";
	// DATATYPE_TABLE_REPRESENTATION is used to determine the form of the table content, consistent with that in .odesign file.
	public static final String DATATYPE_TABLE_REPRESENTATION = "Datatype Table";
	// DATA_TABLE_NAME is used to set the name of each data table
	public static final String DATATYPE_TABLE_NAME = "Data type definition table";
	
	public static final String INTERFACE_TABLE_IDENTIFIER = "2-Interface";
	public static final String INTERFACE_TABLE_REPRESENTATION = "Interface Table";
	public static final String INTERFACE_TABLE_NAME = "Interface definition table";
	
	public static final String INTERACTION_TABLE_IDENTIFIER = "3-Interaction";
	public static final String INTERACTION_TABLE_REPRESENTATION = "Interaction Table";
	public static final String INTERACTION_TABLE_NAME = "Interaction definition table";
}
