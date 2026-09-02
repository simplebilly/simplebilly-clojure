(ns simple-billy-api.specs.category-total
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def category-total-data
  {
   (ds/req :category_id) string?
   (ds/req :share_pct) float?
   (ds/req :tco2e) string?
   })

(def category-total-spec
  (ds/spec
    {:name ::category-total
     :spec category-total-data}))
