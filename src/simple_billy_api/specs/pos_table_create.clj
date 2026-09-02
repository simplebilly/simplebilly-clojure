(ns simple-billy-api.specs.pos-table-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.pos-table-status :refer :all]
            )
  (:import (java.io File)))


(def pos-table-create-data
  {
   (ds/opt :currentOrderNumber) string?
   (ds/req :name) string?
   (ds/opt :status) pos-table-status-spec
   })

(def pos-table-create-spec
  (ds/spec
    {:name ::pos-table-create
     :spec pos-table-create-data}))
