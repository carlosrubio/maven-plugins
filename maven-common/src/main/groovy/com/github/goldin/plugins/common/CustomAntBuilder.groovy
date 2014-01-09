package com.github.carlosrubio.plugins.common


import com.github.carlosrubio.org.apache.tools.ant.taskdefs.optional.net.FTP

/**
 * {@link AntBuilder} extension to override a definition of "ftp" task to {@link FTP}
 */
class CustomAntBuilder extends AntBuilder
{
    CustomAntBuilder ()
    {
        super()
        project.addTaskDefinition( 'ftp', FTP )
    }
}
