/**
 * Copyright (C) 2010-2016 eBusiness Information, Excilys Group
 * Copyright (C) 2016 the AndroidAnnotations project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed To in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.androidannotations.test.preference;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.util.FragmentTestUtil;

@RunWith(RobolectricTestRunner.class)
public class PreferenceScreenFragmentTest {

	private PreferenceScreenFragment_ fragment;

	@Before
	public void setUp() {
		fragment = new PreferenceScreenFragment_();
		FragmentTestUtil.startFragment(fragment);
	}

	@Test
	public void testPreferenceScreenInjected() {
		assertThat(fragment.getPreferenceScreen()).isNotNull();
	}
}
