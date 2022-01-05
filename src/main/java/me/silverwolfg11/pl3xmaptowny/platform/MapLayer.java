/*
 * Copyright (c) 2022 Silverwolfg11
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package me.silverwolfg11.pl3xmaptowny.platform;

import me.silverwolfg11.pl3xmaptowny.objects.MarkerOptions;
import me.silverwolfg11.pl3xmaptowny.objects.Point2D;
import me.silverwolfg11.pl3xmaptowny.objects.Polygon;

import java.util.List;
import java.util.function.Predicate;

public interface MapLayer {

    void addMultiPolyMarker(String markerKey, List<Polygon> polygons, MarkerOptions markerOptions);

    void addIconMarker(String markerKey, String iconKey, Point2D iconLoc, int sizeX, int sizeY, MarkerOptions markerOptions);

    boolean removeMarker(String markerKey);

    void removeMarkers(Predicate<String> markerKeyFilter);
}
