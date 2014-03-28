/*
 * Copyright (C) 2010 IsmAvatar <IsmAvatar@gmail.com>
 * 
 * This file is part of Enigma Plugin.
 * Enigma Plugin is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for details.
 */

package org.enigma.backend.resources;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

public class GameInformation extends Structure
	{
	public int backgroundColor; //default GM color 0xFFFFE100
	public boolean embedGameWindow;
	public String formCaption;
	public int left;
	public int top;
	public int width;
	public int height;
	public boolean showBorder;
	public boolean allowResize;
	public boolean stayOnTop;
	public boolean pauseGame;
	public String gameInfoStr;
	
	@Override
	protected List<String> getFieldOrder()
		{
		return Arrays.asList("backgroundColor","embedGameWindow","formCaption","left","top","width",
				"height","showBorder","allowResize","stayOnTop","pauseGame","gameInfoStr");
		}

	}
