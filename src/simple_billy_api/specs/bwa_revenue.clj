(ns simple-billy-api.specs.bwa-revenue
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.revenue-item :refer :all]
            )
  (:import (java.io File)))


(def bwa-revenue-data
  {
   (ds/req :revenue_breakdown) (s/coll-of revenue-item-spec)
   (ds/req :total_revenue) string?
   })

(def bwa-revenue-spec
  (ds/spec
    {:name ::bwa-revenue
     :spec bwa-revenue-data}))
