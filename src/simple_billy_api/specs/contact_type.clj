(ns simple-billy-api.specs.contact-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def contact-type-data
  {
   })

(def contact-type-spec
  (ds/spec
    {:name ::contact-type
     :spec contact-type-data}))
