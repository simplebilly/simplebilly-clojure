(ns simple-billy-api.specs.inventory-count-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def inventory-count-status-data
  {
   })

(def inventory-count-status-spec
  (ds/spec
    {:name ::inventory-count-status
     :spec inventory-count-status-data}))
