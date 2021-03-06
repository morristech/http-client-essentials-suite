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

package org.dmfs.httpessentials.executors.authorizing;

import org.dmfs.optional.Optional;

import java.net.URI;


/**
 * An authentication scope.
 *
 * @author Marten Gajda
 */
public interface AuthScope
{
    /**
     * Returns the {@link URI} of this {@link AuthScope}.
     *
     * @return A {@link URI}.
     */
    URI uri();

    /**
     * Returns the realm {@link CharSequence} of the {@link AuthScope} if there is any.
     *
     * @return An {@link Optional} {@link CharSequence}.
     */
    Optional<CharSequence> realm();
}
