/*
 * Copyright 2017 dmfs GmbH
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dmfs.httpessentials.executors.following;

/**
 * Interface for defining a redirect policy, i.e. deciding what to do with a redirect response: follow it or not and to what new location. Receiving the entire
 * response allows specifically customized policy implementations.
 *
 * @author Marten Gajda
 * @author Gabor Keszthelyi
 * @deprecated in favor of {@link RedirectStrategy}
 */
@Deprecated
public interface RedirectPolicy extends RedirectStrategy
{
}
