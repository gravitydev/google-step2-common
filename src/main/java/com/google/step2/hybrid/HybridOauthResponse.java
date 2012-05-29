/**
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package com.google.step2.hybrid;

import org.openid4java.message.MessageException;
import org.openid4java.message.Parameter;
import org.openid4java.message.ParameterList;

import java.util.Arrays;
import java.util.List;

/**
 * Hybrid OAuth Message Extension for Responses
 *
 * @author steveweis@google.com (Steve Weis)
 */
public class HybridOauthResponse extends HybridOauthMessage {

  private final static List<String> requiredFields = Arrays.asList();

  private final static List<String> optionalFields =
    Arrays.asList(new String[] {SCOPE, OAUTH_TOKEN});

  HybridOauthResponse(ParameterList parameters) throws MessageException {
    this.parameters = parameters;
    if (!isValid()) {
      throw new MessageException("Invalid parameters for Oauth fetch");
    }
  }

  public HybridOauthResponse(String requestToken, String scope) {
    if (scope != null && scope.trim().length() > 0) {
      parameters.set(new Parameter(SCOPE, scope.trim()));
    }
    if (requestToken != null && requestToken.trim().length() > 0) {
      parameters.set(new Parameter(OAUTH_TOKEN, requestToken.trim()));
    }
  }

  public String getRequestToken() {
    return getParameter(OAUTH_TOKEN);
  }

  boolean isValid() {
    return isValid(requiredFields, optionalFields);
  }
}
