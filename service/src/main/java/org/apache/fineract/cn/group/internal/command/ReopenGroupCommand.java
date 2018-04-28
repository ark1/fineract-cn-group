/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.cn.group.internal.command;

import org.apache.fineract.cn.group.api.v1.domain.GroupCommand;

public class ReopenGroupCommand {

  private final String identifier;
  private final GroupCommand groupCommand;

  public ReopenGroupCommand(final String identifier, final GroupCommand groupCommand) {
    super();
    this.identifier = identifier;
    this.groupCommand = groupCommand;
  }

  public String identifier() {
    return this.identifier;
  }

  public GroupCommand groupCommand() {
    return this.groupCommand;
  }
}
