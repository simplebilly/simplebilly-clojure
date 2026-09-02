(ns simple-billy-api.specs.pos-table-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pos-table-status-data
  {
   })

(def pos-table-status-spec
  (ds/spec
    {:name ::pos-table-status
     :spec pos-table-status-data}))
