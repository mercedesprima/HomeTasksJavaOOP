package Task3;
import java.util.Iterator;
import java.util.NoSuchElementException;

    public class CargoTrain<T> implements Iterable<T> {
        private RailCar<T> head;
        private RailCar<T> tail;
        private int size;
        private int num;

        public CargoTrain() {
            head = null;
            tail = null;
            size = 0;
        }

        public void add(T value) {
            RailCar<T> car = new RailCar<>(value);
            if (size == 0) {
                head = car;
            } else {
                tail.next = car;
                car.prev = tail;
            }
            tail = car;
            size++;
        }

        public void addFirst(T value) {
            RailCar<T> car = new RailCar<>(value);
            if (size == 0) {
                head = car;
                tail = car;
            } else {
                head.prev = car;
                car.next = head;
                head = car;
            }
            size++;
        }

        public void remove(T value, boolean isAll) {
            RailCar<T> current = head;
            while (current != null) {
                if (current.value.equals(value)) {
                    if (current.prev == null) {
                        head = current.next;
                        head.prev = null;
                    } else if (current.next == null) {
                        tail = current.prev;
                        tail.next = null;
                    } else {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                    }
                    size--;
                    if (!isAll) {
                        return;
                    }
                }
                current = current.next;
            }
        }

        public T get(int index) {
            if (index >= 0 && index < size) {
                RailCar<T> current = head;
                num = 0;
                while (current != null) {
                    if (num == index) {
                        return current.value;
                    }
                    num++;
                    current = current.next;
                }
            }
            if (index >= -size && index < 0) {
                RailCar<T> current = tail;
                num = -1;
                while (current != null) {
                    if (num == index) {
                        return current.value;
                    }
                    num--;
                    current = current.prev;
                }
            }
            return null;
        }

        public void removeFirst() {
            if (size == 0) {
                throw new NoSuchElementException();
            } else if (size == 1) {
                head = null;
                tail = null;
            } else {
                head = head.next;
            }
            size--;
        }

        public void removeLast() {
            if (size == 0) {
                throw new NoSuchElementException();
            } else if (size == 1) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }

        public void clear() {
            size = 0;
            head = null;
            tail = null;
        }

        public boolean isEmpty() {
            return size > 0;
        }

        public int size() {
            return size;
        }
        private static class RailCar<T> {
            T value;
            RailCar<T> next;
            RailCar<T> prev;

            public RailCar(T value) {
                this.value = value;
                next = null;
                prev = null;
            }
        }
        @Override
        public Iterator<T> iterator() {
            return new Iterator<>() {
                private RailCar<T> current = head;

                @Override
                public boolean hasNext() {
                    return current != null;
                }

                @Override
                public T next() {
                    T value = current.value;
                    current = current.next;
                    return value;
                }
            };
        }
    }

