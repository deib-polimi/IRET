/*******************************************************************************
 * Copyright 2010-2012 CEFRIEL Ð Politecnico di Milano
 *  
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *  
 *        http://www.apache.org/licenses/LICENSE-2.0
 *  
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 ******************************************************************************/
package eu.indenica.iret.diagram.sheet;
import org.eclipse.swt.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.layout.*;

public class ColumnLayout extends Layout {
    // fixed margin and spacing
    public static final int MARGIN = 4;
    public static final int SPACING = 2;
    // cache
    Point[] sizes;
    int maxWidth, totalHeight;

    protected Point computeSize(Composite composite, int wHint, int hHint,
            boolean flushCache) {
        Control children[] = composite.getChildren();
        if (flushCache || sizes == null || sizes.length != children.length) {
            initialize(children);
        }
        int width = wHint, height = hHint;
        if (wHint == SWT.DEFAULT)
            width = maxWidth;
        if (hHint == SWT.DEFAULT)
            height = totalHeight;
        return new Point(width + 2 * MARGIN, height + 2 * MARGIN);
    }

    protected void layout(Composite composite, boolean flushCache) {
        Control children[] = composite.getChildren();
        if (flushCache || sizes == null || sizes.length != children.length) {
            initialize(children);
        }
        Rectangle rect = composite.getClientArea();
        int x = MARGIN, y = MARGIN;
        int width = Math.max(rect.width - 2 * MARGIN, maxWidth);
        for (int i = 0; i < children.length; i++) {
            int height = sizes[i].y;
            children[i].setBounds(x, y, width, height);
            y += height + SPACING;
        }
    }

    void initialize(Control children[]) {
        maxWidth = 0;
        totalHeight = 0;
        sizes = new Point[children.length];
        for (int i = 0; i < children.length; i++) {
            sizes[i] = children[i].computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
            maxWidth = Math.max(maxWidth, sizes[i].x);
            totalHeight += sizes[i].y;
        }
        totalHeight += (children.length - 1) * SPACING;
    }
}
