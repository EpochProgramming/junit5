/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.vintage.engine.samples.junit4;

import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * @since 4.12
 */
public class MalformedJUnit4TestCase {

	@Test
	/* intentionally not public */
	void nonPublicTest() {
		fail("this should never be called");
	}

}
