/*******************************************************************************
 * Copyright (c) 2011-2014 SirSengir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Various Contributors including, but not limited to:
 * SirSengir (original work), CovertJaguar, Player, Binnie, MysteriousAges
 ******************************************************************************/
package forestry.core.network;

import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import cpw.mods.fml.common.network.internal.FMLProxyPacket;

public class PacketDummy implements IForestryPacketClient, IForestryPacketServer {

	public static final PacketDummy instance = new PacketDummy();

	private PacketDummy() {

	}

	@Override
	public void onPacketData(DataInputStreamForestry data, EntityPlayer player) throws IOException {

	}

	@Override
	public void onPacketData(DataInputStreamForestry data, EntityPlayerMP player) throws IOException {

	}

	@Override
	public void readData(DataInputStreamForestry data) throws IOException {

	}

	@Override
	public FMLProxyPacket getPacket() {
		return null;
	}


}