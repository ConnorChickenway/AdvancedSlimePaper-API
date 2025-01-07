package com.infernalsuite.aswm.loaders.mongo;

import com.infernalsuite.aswm.api.exceptions.UnknownWorldException;
import com.infernalsuite.aswm.loaders.UpdatableLoader;
import com.mongodb.MongoException;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.List;

public class MongoLoader extends UpdatableLoader {

    public MongoLoader(String database, String collection, @Nullable String username, @Nullable String password,
                       @Nullable String authSource, @Nullable String host, @Nullable Integer port, @Nullable String uri) throws MongoException {

    }

    @Override
    public void update() {

    }

    @Override
    public byte[] readWorld(String worldName) throws UnknownWorldException, IOException {
        return null;
    }

    @Override
    public boolean worldExists(String worldName) throws IOException {
        return false;
    }

    @Override
    public List<String> listWorlds() throws IOException {
        return null;
    }

    @Override
    public void saveWorld(String worldName, byte[] serializedWorld) throws IOException {

    }

    @Override
    public void deleteWorld(String worldName) throws IOException, UnknownWorldException {

    }

}
