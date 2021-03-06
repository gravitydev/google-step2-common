/**
 * Copyright 2009 Google Inc.
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
 *
 */
package com.google.step2.xmlsimplesign;

import com.google.inject.ImplementedBy;

import java.security.cert.X509Certificate;
import java.util.Collection;


/**
 * Interface that defines trust roots providers. A trust roots provider
 * returns the list of certificates we should trust as Certification
 * Authorities.
 */
@ImplementedBy(DefaultTrustRootsProvider.class)
public interface TrustRootsProvider {
  /**
   * Returns the list of certificates that we should trust as Certification
   * Authorities.
   */
  public Collection<X509Certificate> getTrustRoots();
}
