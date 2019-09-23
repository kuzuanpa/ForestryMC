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
package forestry.core.gui;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.PacketBuffer;

import forestry.core.features.CoreContainers;
import forestry.core.gui.slots.SlotFiltered;
import forestry.core.gui.slots.SlotLiquidIn;
import forestry.core.gui.slots.SlotOutput;
import forestry.core.gui.slots.SlotWorking;
import forestry.core.inventory.InventoryAnalyzer;
import forestry.core.tiles.TileAnalyzer;
import forestry.core.tiles.TileUtil;

public class ContainerAnalyzer extends ContainerLiquidTanks<TileAnalyzer> {

	public static ContainerAnalyzer fromNetwork(int windowId, PlayerInventory playerInv, PacketBuffer extraData) {
		TileAnalyzer analyzer = TileUtil.getTile(playerInv.player.world, extraData.readBlockPos(), TileAnalyzer.class);
		return new ContainerAnalyzer(windowId, playerInv, analyzer);    //TODO what to do if analyzer null
	}

	public ContainerAnalyzer(int windowId, PlayerInventory player, TileAnalyzer tile) {
		super(windowId, CoreContainers.ANALYZER.containerType(), player, tile, 8, 94);

		// Input buffer
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 2; k++) {
				this.addSlot(new SlotFiltered(tile, InventoryAnalyzer.SLOT_INPUT_1 + i * 2 + k, 8 + k * 18, 28 + i * 18));
			}
		}

		// Analyze slot
		this.addSlot(new SlotWorking(tile, InventoryAnalyzer.SLOT_ANALYZE, 73, 59));

		// Can slot
		this.addSlot(new SlotLiquidIn(tile, InventoryAnalyzer.SLOT_CAN, 143, 24));

		// Output buffer
		for (int i = 0; i < 2; i++) {
			for (int k = 0; k < 2; k++) {
				this.addSlot(new SlotOutput(tile, InventoryAnalyzer.SLOT_OUTPUT_1 + i * 2 + k, 134 + k * 18, 48 + i * 18));
			}
		}
	}
}
