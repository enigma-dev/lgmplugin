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

import org.enigma.backend.sub.Moment;

import com.sun.jna.Structure;

public class Timeline extends Structure
	{
	public String name;
	public int id;

	public Moment.ByReference moments;
	public int momentCount;

	@Override
	protected List<String> getFieldOrder()
		{
		return Arrays.asList("name","id","moments","momentCount");
		}

	public static class ByReference extends Timeline implements Structure.ByReference
		{
		}
	}
