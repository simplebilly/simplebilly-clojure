(ns simple-billy-api.specs.communication-direction
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def communication-direction-data
  {
   })

(def communication-direction-spec
  (ds/spec
    {:name ::communication-direction
     :spec communication-direction-data}))
