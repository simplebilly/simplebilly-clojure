(ns simple-billy-api.specs.sales-volume-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.sales-volume-item :refer :all]
            )
  (:import (java.io File)))


(def sales-volume-report-data
  {
   (ds/req :grand_total) string?
   (ds/req :items) (s/coll-of sales-volume-item-spec)
   (ds/req :total_count) int?
   })

(def sales-volume-report-spec
  (ds/spec
    {:name ::sales-volume-report
     :spec sales-volume-report-data}))
