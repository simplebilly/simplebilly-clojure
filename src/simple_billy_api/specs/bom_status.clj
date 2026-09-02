(ns simple-billy-api.specs.bom-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bom-status-data
  {
   })

(def bom-status-spec
  (ds/spec
    {:name ::bom-status
     :spec bom-status-data}))
