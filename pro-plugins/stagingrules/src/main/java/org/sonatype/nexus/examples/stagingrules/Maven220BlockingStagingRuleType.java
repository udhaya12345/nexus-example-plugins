/*
 * Copyright (c) 2007-2012 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.sonatype.nexus.examples.stagingrules;

import org.codehaus.plexus.component.annotations.Component;

import com.sonatype.nexus.staging.rule.StagingRuleType;

/**
 * {@link Maven220BlockingStagingRuleEvaluator} UI descriptor.
 *
 * @since 1.0
 */
@Component( role = StagingRuleType.class, hint = Maven220BlockingStagingRuleType.TYPE_ID )
public class Maven220BlockingStagingRuleType
    extends StagingRuleType
{
    public static final String TYPE_ID = "maven220blocking-staging";

    public String getDescription()
    {
        return "Verifies Maven 2.2.0 was not used to stage a repository.";
    }

    public String getId()
    {
        return TYPE_ID;
    }

    public String getName()
    {
        return "Staging Maven 2.2.0 Blocker";
    }

}
