package connection

const val CREDENTIALS_LOCAL_PORT = "27018"

/**
 *  Start mongod
 *
 *  mongod --dbpath data/db --port 27018
 *
 *  --fork optional to start as a demon process
 *
 *  Stopping mongod from mongo shell:
 *  use admin
 *  db.shutdownServer()
 *
 *  Stopping mongod from linux shell:
 *  mongod --shutdown
 *
 *
 */


/**
 *  Start mongo
 *
 *  mongo <db> -host <host> --port <port>
 */
