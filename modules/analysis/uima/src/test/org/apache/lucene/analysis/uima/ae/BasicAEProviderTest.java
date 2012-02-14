package org.apache.lucene.analysis.uima.ae;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.uima.analysis_engine.AnalysisEngine;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * TestCase for {@link BasicAEProvider}
 */
public class BasicAEProviderTest {

  @Test
  public void testBasicInititalization() throws Exception {
    AEProvider basicAEProvider = new BasicAEProvider("/uima/DummyEntityAE.xml");
    AnalysisEngine analysisEngine = basicAEProvider.getAE();
    assertNotNull(analysisEngine);
  }
}