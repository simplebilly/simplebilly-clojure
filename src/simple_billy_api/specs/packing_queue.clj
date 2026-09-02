(ns simple-billy-api.specs.packing-queue
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.packing-queue-item :refer :all]
            )
  (:import (java.io File)))


(def packing-queue-data
  {
   (ds/req :items) (s/coll-of packing-queue-item-spec)
   (ds/req :page) int?
   (ds/req :page_size) int?
   (ds/req :total_count) int?
   })

(def packing-queue-spec
  (ds/spec
    {:name ::packing-queue
     :spec packing-queue-data}))
