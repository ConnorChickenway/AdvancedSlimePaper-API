package com.infernalsuite.aswm.loaders.api;

import com.infernalsuite.aswm.api.exceptions.UnknownWorldException;
import com.infernalsuite.aswm.api.loaders.SlimeLoader;

import java.io.IOException;
import java.util.List;

public class APILoader implements SlimeLoader {

    public APILoader(String apiUrl, String username, String token, boolean ignoreSslCertificate) {
    }

    @Override
    public byte[] readWorld(String worldName) throws UnknownWorldException, IOException {
        return null;
    }

    @Override
    public boolean worldExists(String worldName) {
        return false;
    }

    @Override
    public List<String> listWorlds() {
        return null;
    }

    @Override
    public void saveWorld(String worldName, byte[] serializedWorld) throws IOException {
    }

    @Override
    public void deleteWorld(String worldName) {
    }
}
