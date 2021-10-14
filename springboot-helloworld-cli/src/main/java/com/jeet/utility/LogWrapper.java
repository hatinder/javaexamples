package com.jeet.utility;

import org.slf4j.Logger;

public class LogWrapper
{
    private Logger logger;


    public LogWrapper(Logger logger)
    {
        this.logger = logger;
    }


    public void debugFormat(String format, Object... args)
    {
        if (logger.isDebugEnabled())
        {
            logger.debug(String.format(format, args));
        }
    }

    public void errorFormat(String format, Object... args)
    {
        if (logger.isErrorEnabled())
        {
            logger.error(String.format(format, args));
        }
    }

    public void infoFormat(String format, Object... args)
    {
        if (logger.isInfoEnabled())
        {
            logger.info(String.format(format, args));
        }
    }

    public Logger getLogger(){
        return this.logger;
    }

}