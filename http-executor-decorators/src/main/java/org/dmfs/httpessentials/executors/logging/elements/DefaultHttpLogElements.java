/*
 * Copyright 2016 Marten Gajda <marten@dmfs.org>
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

package org.dmfs.httpessentials.executors.logging.elements;

import org.dmfs.httpessentials.executors.logging.elements.elements.MethodAndUri;
import org.dmfs.httpessentials.executors.logging.elements.elements.RequestContentDesc;
import org.dmfs.httpessentials.executors.logging.elements.elements.RequestHeaders;
import org.dmfs.httpessentials.executors.logging.elements.elements.ResponseContentDesc;
import org.dmfs.httpessentials.executors.logging.elements.elements.ResponseHeaders;
import org.dmfs.httpessentials.executors.logging.elements.elements.Status;
import org.dmfs.httpessentials.executors.logging.logfacility.LogFacility;

import java.util.List;

import static org.dmfs.httpessentials.executors.logging.elements.elements.RequestHeaders.ONLY_NON_PERSONAL;


/**
 * @author Gabor Keszthelyi
 */
public class DefaultHttpLogElements implements HttpLogElements
{
    private final HttpLogElements mDelegate;


    public DefaultHttpLogElements(LogFacility logFacility)
    {
        mDelegate = new HttpLogElementsBuilder()
                // Request elements in the order of printing:
                .add(new MethodAndUri())
                .add(new RequestHeaders(ONLY_NON_PERSONAL))
                .add(new RequestContentDesc())

                // Response elements in the order of printing:
                .add(new Status())
                .add(new ResponseHeaders())
                .add(new ResponseContentDesc())

                // LogSinkProvider for the body logging:
                .add(new AllBody(logFacility))
                .build();
    }


    @Override
    public List<RequestLogElement> requestLogElements()
    {
        return mDelegate.requestLogElements();
    }


    @Override
    public List<ResponseLogElement> responseLogElements()
    {
        return mDelegate.responseLogElements();
    }


    @Override
    public LogSinkProvider contentLogSinkProvider()
    {
        return mDelegate.contentLogSinkProvider();
    }
}
