(ns simple-billy-api.specs.revenue-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def revenue-item-data
  {
   (ds/req :amount) string?
   (ds/req :category) string?
   (ds/req :percentage) float?
   })

(def revenue-item-spec
  (ds/spec
    {:name ::revenue-item
     :spec revenue-item-data}))
