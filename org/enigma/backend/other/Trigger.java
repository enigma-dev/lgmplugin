/*
 * Copyright (C) 2010 IsmAvatar <IsmAvatar@gmail.com>
 *
 * This file is part of Enigma Plugin.
 * Enigma Plugin is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for details.
 */

package org.enigma.backend.other;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

public class Trigger extends Structure
	{
	String name;
	String condition;
	int checkStep;
	String constant;

	@Override
	protected List<String> getFieldOrder()
		{
		return Arrays.asList("name","condition","checkStep","constant");
		}

	public static class ByReference extends Trigger implements Structure.ByReference
		{
		}
	}
