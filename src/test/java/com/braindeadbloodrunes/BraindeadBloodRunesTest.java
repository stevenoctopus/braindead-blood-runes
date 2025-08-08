package com.braindeadbloodrunes;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class BraindeadBloodRunesTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(BraindeadBloodRunesPlugin.class);
		RuneLite.main(args);
	}
}