/* SPDX-License-Identifier: MIT */

package li.cil.oc2.common.bus.device.util;

import li.cil.oc2.api.bus.device.DeviceType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistryEntry;

public final class DeviceTypeImpl extends ForgeRegistryEntry<DeviceType> implements DeviceType {
    private final Tag<Item> tag;
    private final ResourceLocation icon;
    private final Component name;

    public DeviceTypeImpl(final Tag<Item> tag, final ResourceLocation icon, final Component name) {
        this.tag = tag;
        this.icon = icon;
        this.name = name;
    }

    @Override
    public Tag<Item> getTag() {
        return tag;
    }

    @Override
    public ResourceLocation getBackgroundIcon() {
        return icon;
    }

    @Override
    public Component getName() {
        return name;
    }
}
