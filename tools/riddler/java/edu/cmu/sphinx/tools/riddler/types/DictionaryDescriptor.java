/**
 * Copyright 1999-2007 Carnegie Mellon University.
 * Portions Copyright 2002 Sun Microsystems, Inc.
 * All Rights Reserved.  Use is subject to license terms.
 * <p/>
 * See the file "license.terms" for information on usage and
 * redistribution of this file, and for a DISCLAIMER OF ALL
 * WARRANTIES.
 * <p/>
 * <p/>
 * User: Garrett Weinberg
 * Date: Jan 20, 2007
 * Time: 12:25:06 PM
 */

package edu.cmu.sphinx.tools.riddler.types;

/**
 * Contains metadata about a Dictionary, in two matched arrays.
 */
public class DictionaryDescriptor {

    String[] metadataKeys;
    String[] metadataValues;

    public DictionaryDescriptor(String[] metadataKeys, String[] metadataValues) {
        this.metadataKeys = metadataKeys;
        this.metadataValues = metadataValues;
    }

    public String[] getMetadataKeys() {
        return metadataKeys;
    }

    public void setMetadataKeys(String[] metadataKeys) {
        this.metadataKeys = metadataKeys;
    }

    public String[] getMetadataValues() {
        return metadataValues;
    }

    public void setMetadataValues(String[] metadataValues) {
        this.metadataValues = metadataValues;
    }

}