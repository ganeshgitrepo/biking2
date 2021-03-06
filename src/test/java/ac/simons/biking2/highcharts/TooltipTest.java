/*
 * Copyright 2014 Michael J. Simons.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ac.simons.biking2.highcharts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Michael J. Simons, 2014-02-11
 */
public class TooltipTest {

    @Test
    public void testBuilder() {
	Tooltip tooltip = new Tooltip.Builder<>(object -> object)
		.withHeaderFormat("testHeader")
		.withPointFormat("testPoint")
		.withFooterFormat("testFoot")
		.share()
		.useHTML()
	.build();
	assertThat(tooltip.getHeaderFormat(), is(equalTo("testHeader")));
	assertThat(tooltip.getPointFormat(), is(equalTo("testPoint")));
	assertThat(tooltip.getFooterFormat(), is(equalTo("testFoot")));
	assertThat(tooltip.isShared(), is(true));
	assertThat(tooltip.isUseHTML(), is(true));		
    }
}
