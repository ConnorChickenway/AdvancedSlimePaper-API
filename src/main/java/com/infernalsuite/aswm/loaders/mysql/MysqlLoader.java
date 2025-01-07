package com.infernalsuite.aswm.loaders.mysql;

import com.infernalsuite.aswm.api.exceptions.UnknownWorldException;
import com.infernalsuite.aswm.loaders.UpdatableLoader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class MysqlLoader extends UpdatableLoader {

    public MysqlLoader(String sqlURL, String host, int port, String database, boolean useSSL, String username, String password) throws SQLException {

    }

    @Override
    public void update() throws IOException, NewerDatabaseException {

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
