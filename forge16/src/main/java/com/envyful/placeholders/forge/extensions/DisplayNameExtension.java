package com.envyful.placeholders.forge.extensions;

import com.envyful.papi.api.manager.extensions.type.SimpleExtension;
import com.google.common.collect.Lists;
import net.minecraft.entity.player.ServerPlayerEntity;

import java.util.List;

public class DisplayNameExtension extends SimpleExtension<ServerPlayerEntity> {

    private static final String NAME = "displayname";
    private static final int PRIORITY = 1;
    private static final List<String> DESCRIPTION = Lists.newArrayList("Gets the player's displayname");
    private static final List<String> EXAMPLES = Lists.newArrayList("%forge_displayname%");

    public DisplayNameExtension() {
        super(NAME, PRIORITY, DESCRIPTION, EXAMPLES);
    }

    @Override
    public String parse(ServerPlayerEntity player, String placeholder) {
        return player.getDisplayName().getString();
    }
}
