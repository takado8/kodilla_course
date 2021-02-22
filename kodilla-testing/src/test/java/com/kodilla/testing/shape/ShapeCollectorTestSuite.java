package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing ShapeCollector")
public class ShapeCollectorTestSuite {
    @Nested
    @DisplayName("Test Shapes...")
    class ShapesTests {
        @DisplayName("Test square")
        @Test
        void testSquare() {
            // given
            var shapeName = "Square";
            var field = 5.5;
            Square square = new Square(shapeName, field);
            // when
            var squareName = square.getShapeName();
            var squareField = square.getField();
            // than
            assertEquals(shapeName, squareName);
            assertEquals(field, squareField);
        }

        @DisplayName("Test triangle")
        @Test
        void testTriangle() {
            // given
            var shapeName = "Triangle";
            var field = 7.7;
            Triangle triangle = new Triangle(shapeName, field);
            // when
            var triangleName = triangle.getShapeName();
            var triangleField = triangle.getField();
            // than
            assertEquals(shapeName, triangleName);
            assertEquals(field, triangleField);
        }

        @DisplayName("Test circle")
        @Test
        void testCircle() {
            // given
            var shapeName = "Circle";
            var field = 7.7;
            Circle circle = new Circle(shapeName, field);
            // when
            var circleName = circle.getShapeName();
            var circleField = circle.getField();
            // than
            assertEquals(shapeName, circleName);
            assertEquals(field, circleField);
        }
    }

    @Nested
    @DisplayName("Test Collector")
    class CollectorTests {
        @Test
        @DisplayName("Test addFigure")
        void testAddFigure(){
            // given
            ShapeCollector collector = new ShapeCollector();
            Shape square = new Square("Square", 5.5);
            // when
            collector.addFigure(square);
            // than
            assertEquals(1, collector.getSize());
        }

        @Test
        @DisplayName("Test GetFigure")
        void testGetFigure() {
            // given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle("Circle", 2.34);
            // when
            collector.addFigure(circle);
            var returnedShape = collector.getFigure(0);
            // than
            assertEquals(circle, returnedShape);
        }

        @Test
        @DisplayName("Test GetNonExistentFigure")
        void testGetNonExistentFigure() {
            // given
            ShapeCollector collector = new ShapeCollector();
            // when
            var returnedShape = collector.getFigure(0);
            // than
            assertNull(returnedShape);
        }

        @Test
        @DisplayName("Test removeFigure")
        void testRemoveFigure(){
            // given
            ShapeCollector collector = new ShapeCollector();
            Shape triangle = new Triangle("Triangle", 35.0567);
            collector.addFigure(triangle);
            // when
            collector.removeFigure(triangle);
            // than
            assertEquals(0, collector.getSize());
        }

        @Test
        @DisplayName("Test removeFigure")
        void testRemoveNonExistentFigure() {
            // given
            ShapeCollector collector = new ShapeCollector();
            Shape triangle = new Triangle("Triangle", 35.0567);
            Shape triangle2 = new Triangle("Triangle2", 3);
            collector.addFigure(triangle);
            // when
            collector.removeFigure(triangle2);
            // than
            assertEquals(1, collector.getSize());
        }

        @Test
        @DisplayName("Test showFigures")
        void testShowFigures() {
            // given
            ShapeCollector collector = new ShapeCollector();
            Shape triangle = new Triangle("Triangle", 35.0567);
            Shape circle = new Circle("Circle2", 2.34);
            collector.addFigure(triangle);
            collector.addFigure(circle);
            // when
            var shapeNames = collector.showFigures();
            // than
            assertEquals("[Triangle, Circle2]", shapeNames);
        }

        @Test
        @DisplayName("Test showFigures with empty list")
        void testShowFiguresEmpty() {
            // given
            ShapeCollector collector = new ShapeCollector();
            // when
            var shapeNames = collector.showFigures();
            // than
            assertEquals("[]", shapeNames);
        }
    }
}
