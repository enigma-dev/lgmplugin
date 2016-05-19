/*
 * Copyright (C) 2014 Robert B. Colton
 *
 * This file is part of Enigma Plugin.
 * Enigma Plugin is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for details.
 */

package org.enigma.backend.sub;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

public class GlyphRange extends Structure
	{
	public int rangeMin;
	public int rangeMax;

	public Glyph.ByReference glyphs; //count = rangeMax - rangeMin

	@Override
	protected List<String> getFieldOrder()
		{
		return Arrays.asList("rangeMin", "rangeMax", "glyphs");
		}

	public static class ByReference extends GlyphRange implements Structure.ByReference
		{
		}
	}
