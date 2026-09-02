(ns simple-billy-api.specs.pos-table
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.pos-table-status :refer :all]
            )
  (:import (java.io File)))


(def pos-table-data
  {
   (ds/opt :currentOrderNumber) string?
   (ds/req :name) string?
   (ds/opt :status) pos-table-status-spec
   })

(def pos-table-spec
  (ds/spec
    {:name ::pos-table
     :spec pos-table-data}))
