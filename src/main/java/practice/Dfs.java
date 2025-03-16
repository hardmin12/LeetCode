package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Dfs {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4; //노드 수
        int m = 4; //간선 수
        int start = 1; //시작 노드

        //인접 리스트 생성
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];

        for (int i =1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        //연결 정보 저장(무방향 그래프)
        graph[1].add(2);
        graph[2].add(1);

        graph[1].add(3);
        graph[3].add(1);

        graph[2].add(4);
        graph[4].add(2);

        graph[3].add(4);
        graph[4].add(3);

        //연결 상태 출력해보기(디버깅용)
        printGraph();

        //DFS 실행
        System.out.println("\nDFS 탐색 시작!");
        dfsFunction(start);

    }

    static void dfsFunction(int node) {
        visited[node] = true;
        System.out.println("방문 노드: " + node);

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfsFunction(next);
            }
        }
    }

    static void printGraph() {
        System.out.println("연결 상태:");
            for (int i =1; i<graph.length; i++) {
                System.out.print(i + " -> ");

                for (int node : graph[i]) {
                    System.out.print(node + " ");
                }

                System.out.println();
            }
        }
    }
