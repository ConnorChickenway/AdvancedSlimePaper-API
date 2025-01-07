package com.infernalsuite.aswm.loaders.file;

import com.infernalsuite.aswm.api.exceptions.UnknownWorldException;
import com.infernalsuite.aswm.api.loaders.SlimeLoader;

import java.io.*;
import java.nio.file.NotDirectoryException;
import java.util.List;

public class FileLoader implements SlimeLoader {

    public FileLoader(File worldDir) throws IllegalStateException {

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
    public List<String> listWorlds() throws NotDirectoryException {
        return null;
    }

    @Override
    public void saveWorld(String worldName, byte[] serializedWorld) throws IOException {
    }

    @Override
    public void deleteWorld(String worldName) throws UnknownWorldException, IOException {

    }
}
