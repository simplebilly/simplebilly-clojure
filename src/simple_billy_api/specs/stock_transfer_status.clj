(ns simple-billy-api.specs.stock-transfer-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def stock-transfer-status-data
  {
   })

(def stock-transfer-status-spec
  (ds/spec
    {:name ::stock-transfer-status
     :spec stock-transfer-status-data}))
