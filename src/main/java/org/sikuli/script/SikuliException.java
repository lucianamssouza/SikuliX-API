/*
 * Copyright 2010-2013, Sikuli.org
 * Released under the MIT License.
 *
 * modified RaiMan 2013
 */
package org.sikuli.script;

public class SikuliException extends Exception {

    protected String _name = "SikuliException";

    public SikuliException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        String ret = _name + ": " + getMessage() + "\n";
        for (StackTraceElement elm : getStackTrace()) {
            ret += "  Line " + elm.getLineNumber()
                    + ", in file " + elm.getFileName() + "\n";
            return ret;
        }
        ret += "Line ?, in File ?";
        return ret;
    }
}
