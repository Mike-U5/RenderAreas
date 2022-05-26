package com.example.renderareas;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class RenderAreasPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(RenderAreasPlugin.class);
		RuneLite.main(args);
	}
}