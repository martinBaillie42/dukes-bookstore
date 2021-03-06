/**
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * You may not modify, use, reproduce, or distribute this software except in
 * compliance with  the terms of the License at:
 * http://java.net/projects/javaeetutorial/pages/BerkeleyLicense
 */
package javaeetutorial.martinspetstore.exception;

/**
 * <p>This application exception indicates that products have not been found.</p>
 */
public class ProductsNotFoundException extends Exception {

    private static final long serialVersionUID = 4156679691884326238L;

    public ProductsNotFoundException() {
    }

    public ProductsNotFoundException(String msg) {
        super(msg);
    }
}
