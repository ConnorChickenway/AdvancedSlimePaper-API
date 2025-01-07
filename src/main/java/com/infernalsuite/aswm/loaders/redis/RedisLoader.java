package com.infernalsuite.aswm.loaders.redis;

import com.infernalsuite.aswm.api.exceptions.UnknownWorldException;
import com.infernalsuite.aswm.api.loaders.SlimeLoader;

import java.io.IOException;
import java.util.List;

public class RedisLoader implements SlimeLoader {

    public RedisLoader(String uri) {

    }

    @Override
    public byte[] readWorld(String name) throws UnknownWorldException, IOException {
        return null;
    }

    @Override
    public boolean worldExists(String name) throws IOException {
        return false;
    }

    @Override
    public List<String> listWorlds() throws IOException {
        return null;
    }

    @Override
    public void saveWorld(String worldName, byte[] bytes) throws IOException {

    }

    @Override
    public void deleteWorld(String worldName) throws UnknownWorldException, IOException {

    }
}